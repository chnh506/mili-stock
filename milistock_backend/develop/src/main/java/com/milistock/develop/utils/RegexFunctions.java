package com.milistock.develop.utils;

import java.security.Principal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.milistock.develop.code.ErrorCode;
import com.milistock.develop.exception.BusinessExceptionHandler;

public class RegexFunctions {

    // Extracts memberId from Principle
    public static Long extractMemberId(Principal principal) {
        String userInfo = principal.getName(); // "LoginInfoDto(memberId=6, serviceNumber=22-70014661, name=김동현)"        
        
        // Use regex to extract memberId
        Pattern pattern = Pattern.compile("memberId=(\\d+)");
        Matcher matcher = pattern.matcher(userInfo);

        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        } else {
            throw new BusinessExceptionHandler("존재하지 않는 아이디 입니다.", ErrorCode.UNAUTHORIZED); // Return null if memberId is not found
        }
    }
}
