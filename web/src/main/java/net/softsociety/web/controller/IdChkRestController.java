package net.softsociety.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName     :web
 * fileName        :IdChkRestController
 * author          :yuuna
 * since           :2022/08/19
 */

@Controller
@Slf4j
@RequestMapping("/ajax")
@ResponseBody
public class IdChkRestController {

    @PostMapping("/idChk")
    public void idChk(String id) {
        log.debug("id: {}", id);
    }
}
