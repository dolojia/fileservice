package com.scd.fileservice.service;

import com.scd.filesdk.model.param.BreakParam;
import com.scd.filesdk.model.param.UploadParam;
import com.scd.fileservice.model.vo.BreakStatus;
import com.scd.fileservice.model.vo.BreakFileInfo;
import com.scd.fileservice.model.vo.DownParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @author chengdu
 * @date 2019/6/22.
 */
public interface FileService {

    String upload(MultipartFile multipartFile, String type, UploadParam uploadParam) throws Exception;

    String download(String fileId, HttpServletResponse response) throws Exception;

    String breakUpload(BreakParam breakParam, String type);

    BreakStatus checkBreakUploadStatus(String md5);

    BreakFileInfo checkFile(String fileId);

    byte[] downloadChunk(DownParam downParam) throws Exception;
}
