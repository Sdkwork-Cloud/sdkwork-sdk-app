from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DocumentBatchUpdateRequest, DocumentContentUpdateRequest, DocumentCopyRequest, DocumentCreateRequest, DocumentUpdateRequest, PlusApiResultDocumentBatchUpdateResultVO, PlusApiResultDocumentContentVO, PlusApiResultDocumentDetailVO, PlusApiResultDocumentOperationVO, PlusApiResultPageDocumentVO, PlusApiResultVoid

class AppDocumentsApi:
    """app_documents API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_document_detail(self, documentId: str) -> PlusApiResultDocumentDetailVO:
        """Get document detail"""
        return self._client.get(f"/app/v3/api/documents/{documentId}")

    def update_document(self, documentId: str, body: DocumentUpdateRequest) -> PlusApiResultDocumentOperationVO:
        """Update document metadata"""
        return self._client.put(f"/app/v3/api/documents/{documentId}", json=body)

    def delete_document(self, documentId: str) -> PlusApiResultVoid:
        """Delete document"""
        return self._client.delete(f"/app/v3/api/documents/{documentId}")

    def get_document_content(self, documentId: str) -> PlusApiResultDocumentContentVO:
        """Get document content"""
        return self._client.get(f"/app/v3/api/documents/{documentId}/content")

    def update_document_content(self, documentId: str, body: DocumentContentUpdateRequest) -> PlusApiResultDocumentContentVO:
        """Update document content"""
        return self._client.put(f"/app/v3/api/documents/{documentId}/content", json=body)

    def list_documents(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageDocumentVO:
        """List documents"""
        return self._client.get(f"/app/v3/api/documents", params=params)

    def create_document(self, body: DocumentCreateRequest) -> PlusApiResultDocumentOperationVO:
        """Create document"""
        return self._client.post(f"/app/v3/api/documents", json=body)

    def copy_document(self, documentId: str, body: DocumentCopyRequest) -> PlusApiResultDocumentOperationVO:
        """Copy document"""
        return self._client.post(f"/app/v3/api/documents/{documentId}/copy", json=body)

    def batch_update_document(self, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update document"""
        return self._client.post(f"/app/v3/api/documents/{documentId}/batch-update", json=body)

    def create_batch_update_document(self, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update document"""
        return self._client.post(f"/app/v3/api/documents/{documentId}:batchUpdate", json=body)
