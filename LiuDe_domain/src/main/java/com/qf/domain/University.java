package com.qf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class University {
    private int Uid;
    private String Uname;
    private String UEname;
    private String Uinfo;
    private String Umark;
    private int Upeople;
    private String Utype;
    private int Uteacher;
    private int Uprofessor;
    private String Ulanguage;
    private String Ubuild;
    private String Uaddr;
    private String Usite;
    private String Unote;
}
