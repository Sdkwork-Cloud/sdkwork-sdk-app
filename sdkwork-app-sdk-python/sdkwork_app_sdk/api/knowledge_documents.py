from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DocumentBatchUpdateRequest, DocumentContentUpdateRequest, DocumentCopyRequest, DocumentCreateRequest, DocumentUpdateRequest, PlusApiResultDocumentBatchUpdateResultVO, PlusApiResultDocumentContentVO, PlusApiResultDocumentDetailVO, PlusApiResultDocumentOperationVO, PlusApiResultPageDocumentVO, PlusApiResultVoid

class KnowledgeDocumentsApi:
    """knowledge_documents API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def restore_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Restore knowledge document"""
        return self._client.put(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/restore")

    def update_restore_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Restore knowledge document"""
        return self._client.put(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/restore")

    def get_knowledge_document_content(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentContentVO:
        """Get knowledge document content"""
        return self._client.get(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/content")

    def update_knowledge_document_content(self, knowledgeBaseId: str, documentId: str, body: DocumentContentUpdateRequest) -> PlusApiResultDocumentContentVO:
        """Update knowledge document content"""
        return self._client.put(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/content", json=body)

    def get_knowledge_document_content_knowledge_base(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentContentVO:
        """Get knowledge document content"""
        return self._client.get(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/content")

    def update_knowledge_document_content_knowledge_base(self, knowledgeBaseId: str, documentId: str, body: DocumentContentUpdateRequest) -> PlusApiResultDocumentContentVO:
        """Update knowledge document content"""
        return self._client.put(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/content", json=body)

    def archive_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Archive knowledge document"""
        return self._client.put(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/archive")

    def update_archive_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Archive knowledge document"""
        return self._client.put(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/archive")

    def get_knowledge_document_detail(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentDetailVO:
        """Get knowledge document detail"""
        return self._client.get(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}")

    def update_knowledge_document(self, knowledgeBaseId: str, documentId: str, body: DocumentUpdateRequest) -> PlusApiResultDocumentOperationVO:
        """Update knowledge document metadata"""
        return self._client.put(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}", json=body)

    def delete_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultVoid:
        """Delete knowledge document"""
        return self._client.delete(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}")

    def get_knowledge_document_detail_knowledge_base(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentDetailVO:
        """Get knowledge document detail"""
        return self._client.get(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}")

    def update_knowledge_document_knowledge_base(self, knowledgeBaseId: str, documentId: str, body: DocumentUpdateRequest) -> PlusApiResultDocumentOperationVO:
        """Update knowledge document metadata"""
        return self._client.put(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}", json=body)

    def delete_knowledge_document_knowledge_base(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultVoid:
        """Delete knowledge document"""
        return self._client.delete(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}")

    def favorite_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Favorite knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/favorite")

    def unfavorite_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Unfavorite knowledge document"""
        return self._client.delete(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/favorite")

    def create_favorite_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Favorite knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/favorite")

    def delete_unfavorite_knowledge_document(self, knowledgeBaseId: str, documentId: str) -> PlusApiResultDocumentOperationVO:
        """Unfavorite knowledge document"""
        return self._client.delete(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/favorite")

    def copy_knowledge_document(self, knowledgeBaseId: str, documentId: str, body: DocumentCopyRequest) -> PlusApiResultDocumentOperationVO:
        """Copy knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/copy", json=body)

    def create_copy_knowledge_document(self, knowledgeBaseId: str, documentId: str, body: DocumentCopyRequest) -> PlusApiResultDocumentOperationVO:
        """Copy knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/copy", json=body)

    def batch_update_knowledge_document(self, knowledgeBaseId: str, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/batch-update", json=body)

    def create_batch_update_knowledge_document(self, knowledgeBaseId: str, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}:batchUpdate", json=body)

    def create_batch_update_knowledge_document_document_id_batch_update(self, knowledgeBaseId: str, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/{documentId}:batchUpdate", json=body)

    def create_batch_update_knowledge_document_batch_update(self, knowledgeBaseId: str, documentId: str, body: DocumentBatchUpdateRequest) -> PlusApiResultDocumentBatchUpdateResultVO:
        """Batch update knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/{documentId}/batch-update", json=body)

    def list_knowledge_documents(self, knowledgeBaseId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageDocumentVO:
        """List knowledge documents"""
        return self._client.get(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents", params=params)

    def create_knowledge_document(self, knowledgeBaseId: str, body: DocumentCreateRequest) -> PlusApiResultDocumentOperationVO:
        """Create knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents", json=body)

    def get_list(self, knowledgeBaseId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageDocumentVO:
        """List knowledge documents"""
        return self._client.get(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents", params=params)

    def create_knowledge_document_knowledge_base(self, knowledgeBaseId: str, body: DocumentCreateRequest) -> PlusApiResultDocumentOperationVO:
        """Create knowledge document"""
        return self._client.post(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents", json=body)

    def batch_delete(self, knowledgeBaseId: str) -> PlusApiResultDocumentOperationVO:
        """Batch delete knowledge documents"""
        return self._client.delete(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/batch-delete")

    def delete_batch(self, knowledgeBaseId: str) -> PlusApiResultDocumentOperationVO:
        """Batch delete knowledge documents"""
        return self._client.delete(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/batch")

    def delete_batch_batch_delete(self, knowledgeBaseId: str) -> PlusApiResultDocumentOperationVO:
        """Batch delete knowledge documents"""
        return self._client.delete(f"/app/v3/api/knowledge_base/{knowledgeBaseId}/documents/batch-delete")

    def delete_batch_documents(self, knowledgeBaseId: str) -> PlusApiResultDocumentOperationVO:
        """Batch delete knowledge documents"""
        return self._client.delete(f"/app/v3/api/knowledge-bases/{knowledgeBaseId}/documents/batch")
