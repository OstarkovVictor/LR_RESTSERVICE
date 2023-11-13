package ru.students.lr___1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.lr___1.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier ("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService {
    @Override
    public Response modify(Response response) {
        response.setErrorMessage("Что-то сломалось");
        return response;


    }}