/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web.util;

import com.proxy.proxya.domain.SessionData;
import com.proxy.proxya.domain.account.User;
import org.springframework.beans.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Session工具类
 *
 * @author kobe_t
 * @date 2018/3/23 8:49
 */
public class SessionUtil {

    public static void put(HttpServletRequest request, User user) {
        HttpSession session = request.getSession();
        SessionData sessionData = new SessionData();
        BeanUtils.copyProperties(user, session);
        session.setAttribute("userInfo", sessionData);
    }
}
