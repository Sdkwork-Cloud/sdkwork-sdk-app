package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type DocumentsApi struct {
    client *sdkhttp.Client
}

func NewDocumentsApi(client *sdkhttp.Client) *DocumentsApi {
    return &DocumentsApi{client: client}
}

// Get document detail
func (a *DocumentsApi) GetDocumentDetail(documentId string) (sdktypes.PlusApiResultDocumentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/documents/%s", documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentDetailVO](raw)
}

// Update document metadata
func (a *DocumentsApi) UpdateDocument(documentId string, body sdktypes.DocumentUpdateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/documents/%s", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Delete document
func (a *DocumentsApi) DeleteDocument(documentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/documents/%s", documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Restore document
func (a *DocumentsApi) RestoreDocument(documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/documents/%s/restore", documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Get document content
func (a *DocumentsApi) GetDocumentContent(documentId string) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/documents/%s/content", documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// Update document content
func (a *DocumentsApi) UpdateDocumentContent(documentId string, body sdktypes.DocumentContentUpdateRequest) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/documents/%s/content", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// Archive document
func (a *DocumentsApi) ArchiveDocument(documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/documents/%s/archive", documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// List documents
func (a *DocumentsApi) ListDocuments(query map[string]interface{}) (sdktypes.PlusApiResultPageDocumentVO, error) {
    raw, err := a.client.Get(AppApiPath("/documents"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageDocumentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageDocumentVO](raw)
}

// Create document
func (a *DocumentsApi) CreateDocument(body sdktypes.DocumentCreateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath("/documents"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Favorite document
func (a *DocumentsApi) FavoriteDocument(documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/documents/%s/favorite", documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Unfavorite document
func (a *DocumentsApi) UnfavoriteDocument(documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/documents/%s/favorite", documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Copy document
func (a *DocumentsApi) CopyDocument(documentId string, body sdktypes.DocumentCopyRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/documents/%s/copy", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch update document
func (a *DocumentsApi) BatchUpdateDocument(documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/documents/%s/batch-update", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}

// Batch update document
func (a *DocumentsApi) CreateBatchUpdateDocument(documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/documents/%s:batchUpdate", documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}

// Batch delete documents
func (a *DocumentsApi) BatchDelete() (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath("/documents/batch-delete"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch delete documents
func (a *DocumentsApi) DeleteBatch() (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath("/documents/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}
