package org.example.loadtestdemo.domain.service;

import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.loadtestdemo.domain.dto.AdminOrderSummaryDto;
import org.example.loadtestdemo.domain.repository.AdminOrderQueryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AdminOrderService {

    private final AdminOrderQueryRepository queryRepository;

    @Transactional(readOnly = true)
    public List<AdminOrderSummaryDto> getSummary() {
        return queryRepository.findSummary();
    }
}