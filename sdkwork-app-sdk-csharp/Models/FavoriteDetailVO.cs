using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? FavoriteId { get; set; }
        public string? FavoriteType { get; set; }
        public string? TargetId { get; set; }
        public string? FavoriteName { get; set; }
        public string? FavoriteDescription { get; set; }
        public string? FolderId { get; set; }
        public string? FolderName { get; set; }
        public string? Tags { get; set; }
        public string? FavoriteTime { get; set; }
        public string? UpdateTime { get; set; }
        public object? TargetInfo { get; set; }
    }
}
