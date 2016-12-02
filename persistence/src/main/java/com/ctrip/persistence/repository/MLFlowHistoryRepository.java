package com.ctrip.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ctrip.persistence.entity.MLFlowHistory;

/**
 * @author juntao zhang
 */
public interface MLFlowHistoryRepository
    extends JpaRepository<MLFlowHistory, Long>, JpaSpecificationExecutor<MLFlowHistory> {

    List<MLFlowHistory> findByMlFlowId(Long id);
    
    MLFlowHistory findByRuntimeId(String runtimeId);
}
