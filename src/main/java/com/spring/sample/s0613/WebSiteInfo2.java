package com.spring.sample.s0613;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class WebSiteInfo2 {
	private String driver;
	private String url;
	private String user;
	private String password;
}
