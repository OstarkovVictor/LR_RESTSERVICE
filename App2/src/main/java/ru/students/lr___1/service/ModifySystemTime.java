package ru.students.lr___1.service;

import lombok. RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.lr___1.model.Response;
@Service
@RequiredArgsConstructor
@Qualifier ("Modify")
public class ModifySystemTime implements MyModifyService {
    @Override
    public Response modify(Response response) {
        response.setSystemTime("");
        return response;


    }}