package wooteco.chess.controller.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wooteco.chess.domain.position.Position;
import wooteco.chess.dto.req.MoveRequestDto;
import wooteco.chess.service.spring.SpringBoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	private final SpringBoardService springBoardService;

	public BoardController(SpringBoardService springBoardService) {
		this.springBoardService = springBoardService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> loadBoard(@PathVariable int id) {
		try {
			return ResponseEntity.status(200).body(springBoardService.load(id));
		} catch (Exception e) {
			return ResponseEntity.status(400).body(e.getMessage());
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> move(@PathVariable int id, @RequestBody MoveRequestDto req) {
		try {
			return ResponseEntity
				.status(200)
				.body(springBoardService.move(
					id,
					Position.of(req.getSourceX(), req.getSourceY()),
					Position.of(req.getTargetX(), req.getTargetY())));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseEntity.status(409).body(e.getMessage());
		}
	}
}
