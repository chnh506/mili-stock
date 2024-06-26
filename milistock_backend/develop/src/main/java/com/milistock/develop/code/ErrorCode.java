package com.milistock.develop.code;

import lombok.Getter;

/**
 * [공통 코드] API 통신에 대한 '에러 코드'를 Enum 형태로 관리를 한다.
 * Global Error CodeList : 전역으로 발생하는 에러코드를 관리한다.
 * Custom Error CodeList : 업무 페이지에서 발생하는 에러코드를 관리한다
 * Error Code Constructor : 에러코드를 직접적으로 사용하기 위한 생성자를 구성한다.
 *
 * @author lee
 */
@Getter
public enum ErrorCode {

    BUSINESS_EXCEPTION_ERROR(200, "B999", "Business Exception Error"),

    /**
     * ******************************* Global Error CodeList ***************************************
     * HTTP Status Code
     * 400 : Bad Request
     * 401 : Unauthorized
     * 403 : Forbidden
     * 404 : Not Found
     * 500 : Internal Server Error
     * *********************************************************************************************
     */
    // 잘못된 서버 요청
    BAD_REQUEST_ERROR(400, "G001", "Bad Request Exception"),

    // @RequestBody 데이터 미 존재
    REQUEST_BODY_MISSING_ERROR(400, "G002", "Required request body is missing"),

    // 유효하지 않은 타입
    INVALID_TYPE_VALUE(400, "G003", " Invalid Type Value"),

    // Request Parameter 로 데이터가 전달되지 않을 경우
    MISSING_REQUEST_PARAMETER_ERROR(400, "G004", "Missing Servlet RequestParameter Exception"),

    // 입력/출력 값이 유효하지 않음
    IO_ERROR(400, "G005", "I/O Exception"),

    // com.google.gson JSON 파싱 실패
    JSON_PARSE_ERROR(400, "G006", "JsonParseException"),
    

    // com.fasterxml.jackson.core Processing Error
    JACKSON_PROCESS_ERROR(400, "G007", "com.fasterxml.jackson.core Exception"),

    //인증 실패
    UNAUTHORIZED(401,"G100","UNAUTHORIZED"),

    // 권한이 없음
    FORBIDDEN_ERROR(403, "G008", "Forbidden Exception"),

    // 서버로 요청한 리소스가 존재하지 않음
    NOT_FOUND_ERROR(404, "G009", "Not Found Exception"),

    // NULL Point Exception 발생
    NULL_POINT_ERROR(404, "G010", "Null Point Exception"),

    // @RequestBody 및 @RequestParam, @PathVariable 값이 유효하지 않음
    NOT_VALID_ERROR(404, "G011", "handle Validation Exception"),

    // @RequestBody 및 @RequestParam, @PathVariable 값이 유효하지 않음
    NOT_VALID_HEADER_ERROR(404, "G012", "Header에 데이터가 존재하지 않는 경우 "),

    CONFLICT(409,"G013","Conflict(중복된 정보로 충돌이 일어남)"),

    UNPROCESSABLE_ENTITY(422,"G014","유효성 검사 오류"),

    // 서버가 처리 할 방법을 모르는 경우 발생
    INTERNAL_SERVER_ERROR(500, "G999", "Internal Server Error Exception"),


    /**
     * ******************************* Custom Error CodeList ***************************************
     */
    // Transaction Insert Error
    INSERT_ERROR(200, "9999", "Insert Transaction Error Exception"),

    // Transaction Update Error
    UPDATE_ERROR(200, "9999", "Update Transaction Error Exception"),

    // Transaction Delete Error
    DELETE_ERROR(200, "9999", "Delete Transaction Error Exception"),


    // JWT Token Error
    UNKNOWN_ERROR(520, "1000", "UNKNOWN_ERROR"),

    NOT_FOUND_TOKEN(401, "1001", "Headers에 토큰 형식의 값 찾을 수 없음"),

    INVALID_TOKEN(401, "1002", "유효하지 않은 토큰"),

    EXPIRED_TOKEN(401, "1003", "기간이 만료된 토큰"),

    UNSUPPORTED_TOKEN(401, "1004", "지원하지 않는 토큰"),

    //본인인증 관련 에러 코드

    AFFILIATION_ERROR(401, "affiliation", ""),
    
    NAME_ERROR(401, "name", ""),

    JOB_ERROR(401, "job", ""),

    SERVICENUMBER_ERROR(401, "serviceNumber", ""),

    ID_ERROR(401, "userId", ""),


    //중복확인 관련 에러코드

    ID_CONFLICT(409,"userId","Conflict(중복된 정보로 충돌이 일어남)"),

    SERVICENUMBER_CONFLICT(409,"serviceNumber","Conflict(중복된 정보로 충돌이 일어남)"),

    //ID 에러



    


    BOARD_VIEW_ERROR(404,"","게시물을 찾을 수 없습니다."),

    BOARD_DELETE_ERROR(404,"","이미 삭제된 게시물 입니다."),



    ; // End

    /**
     * ******************************* Error Code Constructor ***************************************
     */
    // 에러 코드의 '코드 상태'을 반환한다.
    private final int status;

    // 에러 코드의 '코드간 구분 값'을 반환한다.
    private final String divisionCode;

    // 에러 코드의 '코드 메시지'을 반환한다.
    private final String message;

    // 생성자 구성
    ErrorCode(final int status, final String divisionCode, final String message) {
        this.status = status;
        this.divisionCode = divisionCode;
        this.message = message;
    }
}