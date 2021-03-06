package org.zerock.m2.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.m2.dto.MsgDTO;
import org.zerock.m2.service.MsgService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="RemoveController", value="/msg/remove")
@Log4j2
public class RemoveController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long mno = Long.parseLong(request.getParameter("mno"));//Service로부터 토스받은 파라미터를 dto에 저장

        String who = request.getParameter("who");

        MsgDTO msgDTO = MsgDTO.builder().who(who).mno(mno).build();

        MsgService.INSTANCE.remove(msgDTO);

        response.sendRedirect("/msg/list?whom=" + who);


    }
}
