package com.example.lab11.controller;
import com.example.lab11.dto.OrderDtoShow;
import com.example.lab11.dto.ReaderDto;
import com.example.lab11.exception.IncorrectDateFormat;
import com.example.lab11.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/readers")
public class ReaderController {
    private final ReaderService readerService;
    @PostMapping
    public ResponseEntity createReader(@RequestBody ReaderDto dto) {
        try {
            readerService.createReader(dto);
            return ResponseEntity.ok("Пользователь успешно создан");
        } catch (IncorrectDateFormat e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    @GetMapping("/{reader_id}")
    public ResponseEntity showReader(@PathVariable Long reader_id){
        ReaderDto readerDto = readerService.showReader(reader_id);
        return ResponseEntity.ok(readerDto);
    }
}
