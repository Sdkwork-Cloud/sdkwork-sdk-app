package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type UploadApi struct {
    client *sdkhttp.Client
}

func NewUploadApi(client *sdkhttp.Client) *UploadApi {
    return &UploadApi{client: client}
}

// 获取上传策略
func (a *UploadApi) GetUploadPolicy(query map[string]interface{}) (sdktypes.PlusApiResultUploadPolicyVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/upload-policy"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUploadPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUploadPolicyVO](raw)
}

// 获取上传凭证
func (a *UploadApi) GetUploadCredentials(query map[string]interface{}) (sdktypes.PlusApiResultUploadCredentialsVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/upload-credentials"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUploadCredentialsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUploadCredentialsVO](raw)
}

// 获取预签名URL
func (a *UploadApi) GetPresignedUrl(body sdktypes.PresignedUrlForm) (sdktypes.PlusApiResultPresignedUrlVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/presigned-url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPresignedUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPresignedUrlVO](raw)
}

// 上传图片
func (a *UploadApi) Image(body *sdktypes.ImageRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/image"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileVO](raw)
}

// 上传Base64图片
func (a *UploadApi) Base64Image(query map[string]interface{}) (sdktypes.PlusApiResultFileVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/image/base64"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileVO](raw)
}

// 获取文件列表
func (a *UploadApi) ListFiles(query map[string]interface{}) (sdktypes.PlusApiResultPageFileVO, error) {
    raw, err := a.client.Get(AppApiPath("/upload/files"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageFileVO](raw)
}

// 多文件上传
func (a *UploadApi) Files(query map[string]interface{}) (sdktypes.PlusApiResultListFileVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/files"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFileVO](raw)
}

// 复制文件
func (a *UploadApi) CopyFile(fileId string, query map[string]interface{}) (sdktypes.PlusApiResultFileVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/upload/files/%s/copy", fileId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileVO](raw)
}

// 单文件上传
func (a *UploadApi) File(body *sdktypes.FileRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/file"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileVO](raw)
}

// 上传分片
func (a *UploadApi) Chunk(body *sdktypes.ChunkRequest, query map[string]interface{}) (sdktypes.PlusApiResultUploadChunkVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/chunk"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUploadChunkVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUploadChunkVO](raw)
}

// 合并分片
func (a *UploadApi) MergeChunks(query map[string]interface{}) (sdktypes.PlusApiResultFileVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/chunk/merge"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileVO](raw)
}

// 初始化分片上传
func (a *UploadApi) InitChunk(body sdktypes.UploadInitForm) (sdktypes.PlusApiResultUploadInitVO, error) {
    raw, err := a.client.Post(AppApiPath("/upload/chunk/init"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUploadInitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUploadInitVO](raw)
}

// 获取上传进度
func (a *UploadApi) GetUploadProgress(uploadId string) (sdktypes.PlusApiResultUploadChunkVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/upload/task/%s/progress", uploadId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUploadChunkVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUploadChunkVO](raw)
}

// 获取存储使用情况
func (a *UploadApi) GetStorageUsage() (sdktypes.PlusApiResultStorageUsageVO, error) {
    raw, err := a.client.Get(AppApiPath("/upload/storage/usage"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultStorageUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultStorageUsageVO](raw)
}

// 获取文件预签名URL
func (a *UploadApi) GetFilePresignedUrl(fileId string, query map[string]interface{}) (sdktypes.PlusApiResultPresignedUrlVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/upload/presigned-url/%s", fileId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPresignedUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPresignedUrlVO](raw)
}

// 获取文件详情
func (a *UploadApi) GetFileDetail(fileId string) (sdktypes.PlusApiResultFileVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/upload/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileVO](raw)
}

// 删除文件
func (a *UploadApi) DeleteFile(fileId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/upload/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 查询分片状态
func (a *UploadApi) GetChunkStatus(query map[string]interface{}) (sdktypes.PlusApiResultListInteger, error) {
    raw, err := a.client.Get(AppApiPath("/upload/chunk/status"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListInteger
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListInteger](raw)
}

// 取消上传
func (a *UploadApi) Cancel(uploadId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/upload/task/%s", uploadId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
