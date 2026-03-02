/** 创建笔记请求 */
export interface NoteCreateRequest {
  /** 笔记标题 */
  title?: string;
  /** 笔记内容 */
  content?: string;
  /** 文件夹ID */
  folderId?: string;
  /** 标签列表 */
  tags?: string[];
}
