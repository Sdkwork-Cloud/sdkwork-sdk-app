package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AppDocumentsApi {
    private final HttpClient client;
    
    public AppDocumentsApi(HttpClient client) {
        this.client = client;
    }

    /** Get document detail */
    public PlusApiResultDocumentDetailVO getDocumentDetail(String documentId) throws Exception {
        return (PlusApiResultDocumentDetailVO) client.get(ApiPaths.appPath("/documents/" + documentId + ""));
    }

    /** Update document metadata */
    public PlusApiResultDocumentOperationVO updateDocument(String documentId, DocumentUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.put(ApiPaths.appPath("/documents/" + documentId + ""), body);
    }

    /** Delete document */
    public PlusApiResultVoid deleteDocument(String documentId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/documents/" + documentId + ""));
    }

    /** Get document content */
    public PlusApiResultDocumentContentVO getDocumentContent(String documentId) throws Exception {
        return (PlusApiResultDocumentContentVO) client.get(ApiPaths.appPath("/documents/" + documentId + "/content"));
    }

    /** Update document content */
    public PlusApiResultDocumentContentVO updateDocumentContent(String documentId, DocumentContentUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentContentVO) client.put(ApiPaths.appPath("/documents/" + documentId + "/content"), body);
    }

    /** List documents */
    public PlusApiResultPageDocumentVO listDocuments(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageDocumentVO) client.get(ApiPaths.appPath("/documents"), params);
    }

    /** Create document */
    public PlusApiResultDocumentOperationVO createDocument(DocumentCreateRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/documents"), body);
    }

    /** Copy document */
    public PlusApiResultDocumentOperationVO copyDocument(String documentId, DocumentCopyRequest body) throws Exception {
        return (PlusApiResultDocumentOperationVO) client.post(ApiPaths.appPath("/documents/" + documentId + "/copy"), body);
    }

    /** Batch update document */
    public PlusApiResultDocumentBatchUpdateResultVO batchUpdateDocument(String documentId, DocumentBatchUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentBatchUpdateResultVO) client.post(ApiPaths.appPath("/documents/" + documentId + "/batch-update"), body);
    }

    /** Batch update document */
    public PlusApiResultDocumentBatchUpdateResultVO createBatchUpdateDocument(String documentId, DocumentBatchUpdateRequest body) throws Exception {
        return (PlusApiResultDocumentBatchUpdateResultVO) client.post(ApiPaths.appPath("/documents/" + documentId + ":batchUpdate"), body);
    }
}
