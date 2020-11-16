//package com.github.onlyofficehelper.ds.Interceptor;
//
//import com.github.onlyofficehelper.core.OnlyOfficeHelperContext;
//import com.github.onlyofficehelper.ds.config.Permissions;
//
///**
// * <p>
// * 权限拦截器,拦截本次请求并判断是否给予相应权限
// * </p>
// *
// * @author EricChen
// * @see Permissions 权限
// */
//public interface PermissionInterceptor {
//    /**
//     * 是否给当前请求编辑权限
//     *
//     * @param onlyOfficeHelperContext 上下文
//     * @return true -> 给予权限; false-> 剥夺权限
//     */
//    boolean canEdit(OnlyOfficeHelperContext onlyOfficeHelperContext);
//
//    /**
//     * 是否给当前请求查看权限
//     *
//     * @param onlyOfficeHelperContext 上下文
//     * @return true -> 给予权限; false-> 剥夺权限
//     */
//    boolean canView(OnlyOfficeHelperContext onlyOfficeHelperContext);
//
//    /**
//     * 是否给当前请求评论权限
//     *
//     * @param onlyOfficeHelperContext 上下文
//     * @return true -> 给予权限; false-> 剥夺权限
//     */
//    boolean canComment(OnlyOfficeHelperContext onlyOfficeHelperContext);
//
//    /**
//     * 是否给当前请求下载权限
//     *
//     * @param onlyOfficeHelperContext 上下文
//     * @return true -> 给予权限; false-> 剥夺权限
//     */
//    boolean canDownload(OnlyOfficeHelperContext onlyOfficeHelperContext);
//
//    /**
//     * 是否给当前请求打印权限
//     *
//     * @param onlyOfficeHelperContext 上下文
//     * @return true -> 给予权限; false-> 剥夺权限
//     */
//    boolean canPrint(OnlyOfficeHelperContext onlyOfficeHelperContext);
//
//    /**
//     * 是否给当前请求Fill Forms权限
//     *
//     * @param onlyOfficeHelperContext 上下文
//     * @return true -> 给予权限; false-> 剥夺权限
//     */
//    boolean canFillForms(OnlyOfficeHelperContext onlyOfficeHelperContext);
//
//    /**
//     * 是否给当前请求review权限
//     *
//     * @param onlyOfficeHelperContext 上下文
//     * @return 是否给当前请求review权限
//     */
//    boolean canReview(OnlyOfficeHelperContext onlyOfficeHelperContext);
//
//}