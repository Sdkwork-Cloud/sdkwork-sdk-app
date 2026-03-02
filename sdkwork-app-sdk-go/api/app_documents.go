package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AppDocumentsApi struct {
    client *sdkhttp.Client
}

func NewAppDocumentsApi(client *sdkhttp.Client) *AppDocumentsApi {
    return &AppDocumentsApi{client: client}
}

// Get document detail
func (a *AppDocumentsApi) GetDocumentDetail(documentId string) (sdktypes.PlusApiResultDocumentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/documents/%s", documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentDetailVO](raw)
}

// Update document metadata
func (a *AppDocumentsApi) UpdateDocument(documentId string, body sdktypes.DocumentUpdateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/documents/%s", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Delete document
func (a *AppDocumentsApi) DeleteDocument(documentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/documents/%s", documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Get document content
func (a *AppDocumentsApi) GetDocumentContent(documentId string) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/documents/%s/content", documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// Update document content
func (a *AppDocumentsApi) UpdateDocumentContent(documentId string, body sdktypes.DocumentContentUpdateRequest) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/documents/%s/content", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// List documents
func (a *AppDocumentsApi) ListDocuments(query map[string]interface{}) (sdktypes.PlusApiResultPageDocumentVO, error) {
    raw, err := a.client.Get(AppApiPath("/documents"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageDocumentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageDocumentVO](raw)
}

// Create document
func (a *AppDocumentsApi) CreateDocument(body sdktypes.DocumentCreateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath("/documents"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Copy document
func (a *AppDocumentsApi) CopyDocument(documentId string, body sdktypes.DocumentCopyRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/documents/%s/copy", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch update document
func (a *AppDocumentsApi) BatchUpdateDocument(documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/documents/%s/batch-update", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}

// Batch update document
func (a *AppDocumentsApi) CreateBatchUpdateDocument(documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/documents/%s:batchUpdate", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}
