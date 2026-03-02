using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteFolderVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? FolderId { get; set; }
        public string? FolderName { get; set; }
        public string? ParentFolderId { get; set; }
        public string? FolderDescription { get; set; }
        public List<FavoriteFolderVO>? SubFolders { get; set; }
        public List<FavoriteItemVO>? FavoriteItems { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
        public int? FavoriteCount { get; set; }
    }
}
