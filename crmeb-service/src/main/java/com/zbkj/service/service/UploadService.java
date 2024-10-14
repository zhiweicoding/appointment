package com.zbkj.service.service;

import com.zbkj.common.vo.FileResultVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * UploadService 接口

 */
public interface UploadService {

    /**
     * 图片上传
     * @param multipartFile 文件
     * @param model 模块 用户user,商品product,微信wechat,news文章
     * @param pid 分类ID 0编辑器,1商品图片,2拼团图片,3砍价图片,4秒杀图片,5文章图片,6组合数据图,7前台用户,8微信系列
     * @return FileResultVo
     */
    FileResultVo imageUpload(MultipartFile multipartFile, String model, Integer pid) throws IOException;

    /**
     * 文件长传
     * @param multipartFile 文件
     * @param model 模块 用户user,商品product,微信wechat,news文章
     * @param pid 分类ID 0编辑器,1商品图片,2拼团图片,3砍价图片,4秒杀图片,5文章图片,6组合数据图,7前台用户,8微信系列
     * @return FileResultVo
     */
    FileResultVo fileUpload(MultipartFile multipartFile, String model, Integer pid) throws IOException;
}
