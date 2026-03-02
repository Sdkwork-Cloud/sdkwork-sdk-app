using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteBatchMoveForm
    {
        public List<string>? FavoriteIds { get; set; }
        public string? TargetFolderId { get; set; }
        public string? FolderId { get; set; }
    }
}
