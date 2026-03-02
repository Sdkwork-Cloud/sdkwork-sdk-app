using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteBatchCheckForm
    {
        public string? FavoriteType { get; set; }
        public List<string>? TargetIds { get; set; }
        public List<CheckItem>? Items { get; set; }
    }
}
