package com.ys.phonebook.payload.response;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class MessageResponse
 * @version 1.0.0
 * @since 17.06.2022, 15:46
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
