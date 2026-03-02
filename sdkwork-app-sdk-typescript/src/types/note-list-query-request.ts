/** 笔记列表查询请求 */
export interface NoteListQueryRequest {
  /** 页码 */
  pageNum?: number;
  /** 每页大小 */
  pageSize?: number;
  /** 排序字段 */
  sortField?: string;
  /** 排序顺序 */
  sortOrder?: string;
  /** 文件夹ID */
  folderId?: string;
  /** 关键词 */
  keyword?: string;
}
