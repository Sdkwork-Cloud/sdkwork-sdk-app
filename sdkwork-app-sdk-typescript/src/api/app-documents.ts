import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { DocumentBatchUpdateRequest, DocumentContentUpdateRequest, DocumentCopyRequest, DocumentCreateRequest, DocumentUpdateRequest, PlusApiResultDocumentBatchUpdateResultVO, PlusApiResultDocumentContentVO, PlusApiResultDocumentDetailVO, PlusApiResultDocumentOperationVO, PlusApiResultPageDocumentVO, PlusApiResultVoid } from '../types';


export class AppDocumentsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get document detail */
  async getDocumentDetail(documentId: string | number): Promise<PlusApiResultDocumentDetailVO> {
    return this.client.get<PlusApiResultDocumentDetailVO>(appApiPath(`/documents/${documentId}`));
  }

/** Update document metadata */
  async updateDocument(documentId: string | number, body: DocumentUpdateRequest): Promise<PlusApiResultDocumentOperationVO> {
    return this.client.put<PlusApiResultDocumentOperationVO>(appApiPath(`/documents/${documentId}`), body);
  }

/** Delete document */
  async deleteDocument(documentId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/documents/${documentId}`));
  }

/** Get document content */
  async getDocumentContent(documentId: string | number): Promise<PlusApiResultDocumentContentVO> {
    return this.client.get<PlusApiResultDocumentContentVO>(appApiPath(`/documents/${documentId}/content`));
  }

/** Update document content */
  async updateDocumentContent(documentId: string | number, body: DocumentContentUpdateRequest): Promise<PlusApiResultDocumentContentVO> {
    return this.client.put<PlusApiResultDocumentContentVO>(appApiPath(`/documents/${documentId}/content`), body);
  }

/** List documents */
  async listDocuments(params?: QueryParams): Promise<PlusApiResultPageDocumentVO> {
    return this.client.get<PlusApiResultPageDocumentVO>(appApiPath(`/documents`), params);
  }

/** Create document */
  async createDocument(body: DocumentCreateRequest): Promise<PlusApiResultDocumentOperationVO> {
    return this.client.post<PlusApiResultDocumentOperationVO>(appApiPath(`/documents`), body);
  }

/** Copy document */
  async copyDocument(documentId: string | number, body: DocumentCopyRequest): Promise<PlusApiResultDocumentOperationVO> {
    return this.client.post<PlusApiResultDocumentOperationVO>(appApiPath(`/documents/${documentId}/copy`), body);
  }

/** Batch update document */
  async batchUpdateDocument(documentId: string | number, body: DocumentBatchUpdateRequest): Promise<PlusApiResultDocumentBatchUpdateResultVO> {
    return this.client.post<PlusApiResultDocumentBatchUpdateResultVO>(appApiPath(`/documents/${documentId}/batch-update`), body);
  }

/** Batch update document */
  async createBatchUpdateDocument(documentId: string | number, body: DocumentBatchUpdateRequest): Promise<PlusApiResultDocumentBatchUpdateResultVO> {
    return this.client.post<PlusApiResultDocumentBatchUpdateResultVO>(appApiPath(`/documents/${documentId}:batchUpdate`), body);
  }
}

export function createAppDocumentsApi(client: HttpClient): AppDocumentsApi {
  return new AppDocumentsApi(client);
}
