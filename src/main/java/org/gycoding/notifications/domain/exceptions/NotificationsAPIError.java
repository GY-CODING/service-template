package org.gycoding.notifications.domain.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum NotificationsAPIError {
    FORBIDDEN("The username has no permission to access this resource.", HttpStatus.FORBIDDEN),
    SERVER_ERROR("An internal server error has occurred, sorry for the inconvenience.", HttpStatus.INTERNAL_SERVER_ERROR);

    public final String code;
    public final String message;
    public final HttpStatus status;

    NotificationsAPIError(String message, HttpStatus status) {
        this.code       = this.name();
        this.message    = message;
        this.status     = status;
    }
}