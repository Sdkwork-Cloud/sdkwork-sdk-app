/** Drive item list query form */
export interface DriveItemListForm {
  /** Item keyword for fuzzy search */
  keyword?: string;
  /** Asset type filter, e.g. IMAGE/VIDEO/AUDIO/DOCUMENT */
  assetType?: string;
  /** Folder id for filtering current folder */
  folderId?: string;
  /** Disk id for filtering */
  diskId?: string;
  /** Sort field, allowed: createdAt, updatedAt, name, size, uploadTime */
  sortField?: string;
  /** Sort direction, ASC or DESC */
  sortDirection?: string;
  /** Page number, starts from 1 */
  pageNum?: number;
  /** Page size */
  pageSize?: number;
}
