/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pigx.common.security.exception;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

import java.util.Map;

/**
 * @author lengleng
 * @date 2018/7/8
 * 自定义OAuth2Exception
 */
public class PigxAuth2Exception extends OAuth2Exception {

	public PigxAuth2Exception(String msg) {
		super(msg);
	}
}