package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type KnowledgeDocumentsApi struct {
    client *sdkhttp.Client
}

func NewKnowledgeDocumentsApi(client *sdkhttp.Client) *KnowledgeDocumentsApi {
    return &KnowledgeDocumentsApi{client: client}
}

// Restore knowledge document
func (a *KnowledgeDocumentsApi) RestoreKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/restore", knowledgeBaseId, documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Restore knowledge document
func (a *KnowledgeDocumentsApi) UpdateRestoreKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/restore", knowledgeBaseId, documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Get knowledge document content
func (a *KnowledgeDocumentsApi) GetKnowledgeDocumentContent(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/content", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// Update knowledge document content
func (a *KnowledgeDocumentsApi) UpdateKnowledgeDocumentContent(knowledgeBaseId string, documentId string, body sdktypes.DocumentContentUpdateRequest) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/content", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// Get knowledge document content
func (a *KnowledgeDocumentsApi) GetKnowledgeDocumentContentKnowledgeBase(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/content", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// Update knowledge document content
func (a *KnowledgeDocumentsApi) UpdateKnowledgeDocumentContentKnowledgeBase(knowledgeBaseId string, documentId string, body sdktypes.DocumentContentUpdateRequest) (sdktypes.PlusApiResultDocumentContentVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/content", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentContentVO](raw)
}

// Archive knowledge document
func (a *KnowledgeDocumentsApi) ArchiveKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/archive", knowledgeBaseId, documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Archive knowledge document
func (a *KnowledgeDocumentsApi) UpdateArchiveKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/archive", knowledgeBaseId, documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Get knowledge document detail
func (a *KnowledgeDocumentsApi) GetKnowledgeDocumentDetail(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentDetailVO](raw)
}

// Update knowledge document metadata
func (a *KnowledgeDocumentsApi) UpdateKnowledgeDocument(knowledgeBaseId string, documentId string, body sdktypes.DocumentUpdateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Delete knowledge document
func (a *KnowledgeDocumentsApi) DeleteKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Get knowledge document detail
func (a *KnowledgeDocumentsApi) GetKnowledgeDocumentDetailKnowledgeBase(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentDetailVO](raw)
}

// Update knowledge document metadata
func (a *KnowledgeDocumentsApi) UpdateKnowledgeDocumentKnowledgeBase(knowledgeBaseId string, documentId string, body sdktypes.DocumentUpdateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Delete knowledge document
func (a *KnowledgeDocumentsApi) DeleteKnowledgeDocumentKnowledgeBase(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Favorite knowledge document
func (a *KnowledgeDocumentsApi) FavoriteKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/favorite", knowledgeBaseId, documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Unfavorite knowledge document
func (a *KnowledgeDocumentsApi) UnfavoriteKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/favorite", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Favorite knowledge document
func (a *KnowledgeDocumentsApi) CreateFavoriteKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/favorite", knowledgeBaseId, documentId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Unfavorite knowledge document
func (a *KnowledgeDocumentsApi) DeleteUnfavoriteKnowledgeDocument(knowledgeBaseId string, documentId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/favorite", knowledgeBaseId, documentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Copy knowledge document
func (a *KnowledgeDocumentsApi) CopyKnowledgeDocument(knowledgeBaseId string, documentId string, body sdktypes.DocumentCopyRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/copy", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Copy knowledge document
func (a *KnowledgeDocumentsApi) CreateCopyKnowledgeDocument(knowledgeBaseId string, documentId string, body sdktypes.DocumentCopyRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/copy", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch update knowledge document
func (a *KnowledgeDocumentsApi) BatchUpdateKnowledgeDocument(knowledgeBaseId string, documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s/batch-update", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}

// Batch update knowledge document
func (a *KnowledgeDocumentsApi) CreateBatchUpdateKnowledgeDocument(knowledgeBaseId string, documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s:batchUpdate", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}

// Batch update knowledge document
func (a *KnowledgeDocumentsApi) CreateBatchUpdateKnowledgeDocumentDocumentIdBatchUpdate(knowledgeBaseId string, documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/%s:batchUpdate", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}

// Batch update knowledge document
func (a *KnowledgeDocumentsApi) CreateBatchUpdateKnowledgeDocumentBatchUpdate(knowledgeBaseId string, documentId string, body sdktypes.DocumentBatchUpdateRequest) (sdktypes.PlusApiResultDocumentBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/%s/batch-update", knowledgeBaseId, documentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentBatchUpdateResultVO](raw)
}

// List knowledge documents
func (a *KnowledgeDocumentsApi) ListKnowledgeDocuments(knowledgeBaseId string, query map[string]interface{}) (sdktypes.PlusApiResultPageDocumentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents", knowledgeBaseId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageDocumentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageDocumentVO](raw)
}

// Create knowledge document
func (a *KnowledgeDocumentsApi) CreateKnowledgeDocument(knowledgeBaseId string, body sdktypes.DocumentCreateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents", knowledgeBaseId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// List knowledge documents
func (a *KnowledgeDocumentsApi) GetList(knowledgeBaseId string, query map[string]interface{}) (sdktypes.PlusApiResultPageDocumentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents", knowledgeBaseId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageDocumentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageDocumentVO](raw)
}

// Create knowledge document
func (a *KnowledgeDocumentsApi) CreateKnowledgeDocumentKnowledgeBase(knowledgeBaseId string, body sdktypes.DocumentCreateRequest) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents", knowledgeBaseId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch delete knowledge documents
func (a *KnowledgeDocumentsApi) BatchDelete(knowledgeBaseId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/batch-delete", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch delete knowledge documents
func (a *KnowledgeDocumentsApi) DeleteBatch(knowledgeBaseId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/batch", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch delete knowledge documents
func (a *KnowledgeDocumentsApi) DeleteBatchBatchDelete(knowledgeBaseId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge_base/%s/documents/batch-delete", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}

// Batch delete knowledge documents
func (a *KnowledgeDocumentsApi) DeleteBatchDocuments(knowledgeBaseId string) (sdktypes.PlusApiResultDocumentOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/knowledge-bases/%s/documents/batch", knowledgeBaseId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDocumentOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDocumentOperationVO](raw)
}
