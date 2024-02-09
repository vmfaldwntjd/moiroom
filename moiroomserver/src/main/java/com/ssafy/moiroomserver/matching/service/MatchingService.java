package com.ssafy.moiroomserver.matching.service;

import java.util.List;

import com.ssafy.moiroomserver.matching.dto.MatchingInfo;

import jakarta.servlet.http.HttpServletRequest;

public interface MatchingService {

	List<MatchingInfo.GetResponse> getInfoForMatching(HttpServletRequest request);
}