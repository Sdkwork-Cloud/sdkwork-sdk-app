package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class KnowledgeDocumentsApi {
    private final HttpClient client;
    
    public KnowledgeDocumentsApi(HttpClient client) {
        this.client = client;
    }

    /** Restore knowledge document */
    public PlusApiResultDocumentOperationVO restoreKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.put(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/restore"), null);
    }

    /** Restore knowledge document */
    public PlusApiResultDocumentOperationVO updateRestoreKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.put(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/restore"), null);
    }

    /** Get knowledge document content */
    public PlusApiResultDocumentContentVO getKnowledgeDocumentContent(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentContentVO) client.get(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/content"));
    }

    /** Update knowledge document content */
    public PlusApiResultDocumentContentVO updateKnowledgeDocumentContent(String knowledgeBaseId, String documentId, DocumentContentUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentContentVO) client.put(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/content"), body);
    }

    /** Get knowledge document content */
    public PlusApiResultDocumentContentVO getKnowledgeDocumentContentKnowledgeBase(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentContentVO) client.get(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/content"));
    }

    /** Update knowledge document content */
    public PlusApiResultDocumentContentVO updateKnowledgeDocumentContentKnowledgeBase(String knowledgeBaseId, String documentId, DocumentContentUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentContentVO) client.put(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/content"), body);
    }

    /** Archive knowledge document */
    public PlusApiResultDocumentOperationVO archiveKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.put(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/archive"), null);
    }

    /** Archive knowledge document */
    public PlusApiResultDocumentOperationVO updateArchiveKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.put(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/archive"), null);
    }

    /** Get knowledge document detail */
    public PlusApiResultDocumentDetailVO getKnowledgeDocumentDetail(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentDetailVO) client.get(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + ""));
    }

    /** Update knowledge document metadata */
    public PlusApiResultDocumentOperationVO updateKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.put(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + ""), body);
    }

    /** Delete knowledge document */
    public PlusApiResultVoid deleteKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + ""));
    }

    /** Get knowledge document detail */
    public PlusApiResultDocumentDetailVO getKnowledgeDocumentDetailKnowledgeBase(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentDetailVO) client.get(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + ""));
    }

    /** Update knowledge document metadata */
    public PlusApiResultDocumentOperationVO updateKnowledgeDocumentKnowledgeBase(String knowledgeBaseId, String documentId, DocumentUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.put(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + ""), body);
    }

    /** Delete knowledge document */
    public PlusApiResultVoid deleteKnowledgeDocumentKnowledgeBase(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + ""));
    }

    /** Favorite knowledge document */
    public PlusApiResultDocumentOperationVO favoriteKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/favorite"), null);
    }

    /** Unfavorite knowledge document */
    public PlusApiResultDocumentOperationVO unfavoriteKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.delete(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/favorite"));
    }

    /** Favorite knowledge document */
    public PlusApiResultDocumentOperationVO createFavoriteKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/favorite"), null);
    }

    /** Unfavorite knowledge document */
    public PlusApiResultDocumentOperationVO deleteUnfavoriteKnowledgeDocument(String knowledgeBaseId, String documentId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.delete(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/favorite"));
    }

    /** Copy knowledge document */
    public PlusApiResultDocumentOperationVO copyKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentCopyRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/copy"), body);
    }

    /** Copy knowledge document */
    public PlusApiResultDocumentOperationVO createCopyKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentCopyRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/copy"), body);
    }

    /** Batch update knowledge document */
    public PlusApiResultDocumentBatchUpdateResultVO batchUpdateKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentBatchUpdateResultVO) client.post(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + "/batch-update"), body);
    }

    /** Batch update knowledge document */
    public PlusApiResultDocumentBatchUpdateResultVO createBatchUpdateKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentBatchUpdateResultVO) client.post(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + ":batchUpdate"), body);
    }

    /** Batch update knowledge document */
    public PlusApiResultDocumentBatchUpdateResultVO createBatchUpdateKnowledgeDocumentDocumentIdBatchUpdate(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentBatchUpdateResultVO) client.post(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/" + documentId + ":batchUpdate"), body);
    }

    /** Batch update knowledge document */
    public PlusApiResultDocumentBatchUpdateResultVO createBatchUpdateKnowledgeDocumentBatchUpdate(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentBatchUpdateResultVO) client.post(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/" + documentId + "/batch-update"), body);
    }

    /** List knowledge documents */
    public PlusApiResultPageDocumentVO listKnowledgeDocuments(String knowledgeBaseId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageDocumentVO) client.get(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents"), params);
    }

    /** Create knowledge document */
    public PlusApiResultDocumentOperationVO createKnowledgeDocument(String knowledgeBaseId, DocumentCreateRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents"), body);
    }

    /** List knowledge documents */
    public PlusApiResultPageDocumentVO getList(String knowledgeBaseId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageDocumentVO) client.get(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents"), params);
    }

    /** Create knowledge document */
    public PlusApiResultDocumentOperationVO createKnowledgeDocumentKnowledgeBase(String knowledgeBaseId, DocumentCreateRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents"), body);
    }

    /** Batch delete knowledge documents */
    public PlusApiResultDocumentOperationVO batchDelete(String knowledgeBaseId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.delete(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/batch-delete"));
    }

    /** Batch delete knowledge documents */
    public PlusApiResultDocumentOperationVO deleteBatch(String knowledgeBaseId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.delete(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/batch"));
    }

    /** Batch delete knowledge documents */
    public PlusApiResultDocumentOperationVO deleteBatchBatchDelete(String knowledgeBaseId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.delete(ApiPaths.appPath("/knowledge_base/" + knowledgeBaseId + "/documents/batch-delete"));
    }

    /** Batch delete knowledge documents */
    public PlusApiResultDocumentOperationVO deleteBatchDocuments(String knowledgeBaseId) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.delete(ApiPaths.appPath("/knowledge-bases/" + knowledgeBaseId + "/documents/batch"));
    }
}
