package ru.students.App1.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.students.App1.model.Request;
@Service
public class ModifyRequestSystemTime implements ModifyRequestService{
        @Override
        public void modifyRq(Request request) {

                request.setSystemTime("test"); // Установить текущее вреня и преобразовать в строку
                HttpEntity<Request> httpEntity = new HttpEntity<>(request);
                new RestTemplate().exchange( "http://losalhost:8082/feedback",
                    HttpMethod.POST,
                    httpEntity,
                    new ParameterizedTypeReference<>(){});}}