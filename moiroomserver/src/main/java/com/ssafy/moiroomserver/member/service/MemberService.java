package com.ssafy.moiroomserver.member.service;

import com.ssafy.moiroomserver.member.dto.MemberInfo;

public interface MemberService {

    void modifyMemberInfo(MemberInfo.ModifyRequest infoModifyRequest);
}