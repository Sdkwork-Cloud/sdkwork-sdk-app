using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalCount { get; set; }
        public int? FolderCount { get; set; }
        public int? MonthlyAdded { get; set; }
        public string? LastFavoritedTime { get; set; }
        public Dictionary<string, int>? CountByType { get; set; }
    }
}
