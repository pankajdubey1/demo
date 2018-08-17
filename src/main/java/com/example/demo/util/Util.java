package com.example.demo.util;

import com.example.demo.dto.ResponseDTO;

public class Util {
    public static String staticMethod() {
        return null;
    }

    public static ResponseDTO getResponseDTO() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setCode(200);
        responseDTO.setStatus("success");
        responseDTO.setMessage("created");
        return responseDTO;
    }
}
