package com.base.pro.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.pro.constant.BaseEnum;
import com.base.pro.entity.BaseTestTableEntity;
import com.base.pro.request.BaseRequest;
import com.base.pro.response.BaseResponse;
import com.base.pro.service.BaseService;
import com.base.pro.service.impl.BaseServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/sunsy/base")
@Api(tags = {"Base接口"})
public class BaseController {

	@Autowired
	private BaseServiceImpl baseService;
	
	@ApiOperation(value = "get测试接口1")
    @GetMapping(value = "/testget1/{id}")
	public BaseTestTableEntity testget1(@ApiParam(value="测试值") @PathVariable String id) {
		int intId = Integer.parseInt(id);
		return baseService.findSome(intId);
    }
	
	@ApiOperation(value = "post登录测试接口1")
	@ApiImplicitParams({
        @ApiImplicitParam(name="params", dataType = "body", value = "{\"userId\":\"userId\", \"password\":\"password\"}")
	})
    @PostMapping(value = "/auth")
	public ResponseEntity<?> authUser( @RequestBody Map<String, String> params) {
		String userId = params.get("userId");
		String password = params.get("password");
		if (userId=="sunsy" && password=="123") {
			return BaseResponse.success("成功");
		} else {
			return BaseResponse.error(BaseEnum.Enmu_1, HttpStatus.UNAUTHORIZED);
		}
    }
	
	@ApiOperation(value = "post登录测试接口2")
	@ApiImplicitParams({
        @ApiImplicitParam(name="testParam", dataType = "body", value = "测试"),

	})
    @PostMapping(value = "/posttest2")
	public ResponseEntity<?> posttest2(@RequestBody BaseRequest handRequest) {
		BaseRequest request = handRequest;
		return BaseResponse.success(request);
    }
}
