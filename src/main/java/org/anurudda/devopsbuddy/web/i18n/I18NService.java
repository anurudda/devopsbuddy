package org.anurudda.devopsbuddy.web.i18n;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by dilan on 7/22/17.
 */
@Service
public class I18NService {
    @Autowired
    private MessageSource messageSource;

    /** The application logger */
    private static final    Logger LOG = org.slf4j.LoggerFactory.getLogger(I18NService.class);

    public String getMessage(String messageId){
        LOG.info("Returning i18n message for message id {}", messageId);
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
        
    }

    public String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId, null, locale);
    }

}
