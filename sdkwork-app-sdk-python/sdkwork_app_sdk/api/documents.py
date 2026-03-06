from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DocumentBatchUpdateRequest, DocumentContentUpdateRequest, DocumentCopyRequest, DocumentCreateRequest, DocumentUpdateRequest, PlusApiResultDocumentBatchUpdateResultVO, PlusApiResultDocumentContentVO, PlusApiResultDocumentDetailVO, PlusApiResultDocumentOperationVO, PlusApiResultPageDocumentVO, PlusApiResultVoid

class DocumentsApi:
    """documents API client."""
    
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

    def restore_document(self, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Restore document"""
        return self._client.put(f"/app/v3/api/documents/{documentId}/restore")

    def get_document_content(self, documentId: str) -> PlusApiResultDocumentContentVO:
        """Get document content"""
        return self._client.get(f"/app/v3/api/documents/{documentId}/content")

    def update_document_content(self, documentId: str, body: DocumentContentUpdateRequest) -> PlusApiResultDocumentContentVO:
        """Update document content"""
        return self._client.put(f"/app/v3/api/documents/{documentId}/content", json=body)

    def archive_document(self, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Archive document"""
        return self._client.put(f"/app/v3/api/documents/{documentId}/archive")

    def list_documents(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageDocumentVO:
        """List documents"""
        return self._client.get(f"/app/v3/api/documents", params=params)

    def create_document(self, body: DocumentCreateRequest) -> PlusApiResultDocumentOperationVO:
        """Create document"""
        return self._client.post(f"/app/v3/api/documents", json=body)

    def favorite_document(self, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Favorite document"""
        return self._client.post(f"/app/v3/api/documents/{documentId}/favorite")

    def unfavorite_document(self, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Unfavorite document"""
        return self._client.delete(f"/app/v3/api/documents/{documentId}/favorite")

    def copy_document(self, documentId: str, body: DocumentCopyRequest) -> PlusApiResultDocumentOperationVO:
        """Copy document"""
        return self._client.post(f"/app/v3/api/documents/{documentId}/copy", json=body)

    def batch_update_document(self, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update document"""
        return self._client.post(f"/app/v3/api/documents/{documentId}/batch-update", json=body)

    def create_batch_update_document(self, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update document"""
        return self._client.post(f"/app/v3/api/documents/{documentId}:batchUpdate", json=body)

    def batch_delete(self) -> PlusApiResultDocumentOperationVO:
        """Batch delete documents"""
        return self._client.delete(f"/app/v3/api/documents/batch-delete")

    def delete_batch(self) -> PlusApiResultDocumentOperationVO:
        """Batch delete documents"""
        return self._client.delete(f"/app/v3/api/documents/batch")
