/** 创建笔记文件夹请求 */
export interface NoteFolderCreateRequest {
  /** 文件夹名称 */
  name?: string;
  /** 父文件夹ID */
  parentId?: string;
}
