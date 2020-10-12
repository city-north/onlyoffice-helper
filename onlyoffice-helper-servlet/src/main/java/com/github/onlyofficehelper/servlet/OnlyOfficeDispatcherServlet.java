package com.github.onlyofficehelper.servlet;

import com.github.onlyofficehelper.constant.BasicConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * OnlyOfficeHelper 核心 Servlet, 用于请求分发
 * </p>
 *
 * @author EricChen 2020/10/12 14:23
 */
public abstract class OnlyOfficeDispatcherServlet extends HttpServlet implements BasicConstant {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = "";
        if (ACTION_VIEW.equals(action)) {
            doView(request, response);
        } else if (ACTION_EDIT.equals(action)) {
            doEdit(request, response);
        } else if (ACTION_REVIEW.equals(action)) {
            doReview(request, response);
        } else if (ACTION_CONVERT.equals(action)) {
            doConvert(request, response);
        } else if (ACTION_TRACK.equals(action)) {
            doTrack(request, response);
        } else {
        }
    }

    protected abstract void doView(HttpServletRequest request, HttpServletResponse response);

    protected abstract void doEdit(HttpServletRequest request, HttpServletResponse response);

    protected abstract void doReview(HttpServletRequest request, HttpServletResponse response);

    /**
     * 转换PDF并下载
     */
    protected abstract void doConvert(HttpServletRequest request, HttpServletResponse response);

    /**
     * OnlyOffice documentServer回调 ,回写
     */
    protected abstract void doTrack(HttpServletRequest request, HttpServletResponse response);

}
