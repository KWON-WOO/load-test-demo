package org.example.loadtestdemo.domain.controller;

import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.loadtestdemo.domain.dto.AdminOrderSummaryDto;
import org.example.loadtestdemo.domain.service.AdminOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/orders")
public class AdminOrderController {

    private final AdminOrderService service;

    @GetMapping("/summary")
    public List<AdminOrderSummaryDto> summary() {
        return service.getSummary();
    }
}