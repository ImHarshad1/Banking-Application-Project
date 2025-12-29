package com.Bank.HDFC.service.impl;

import com.Bank.HDFC.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);

}