using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteStatisticsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TotalNotes { get; set; }
        public int? TotalFolders { get; set; }
        public int? FavoritedNotes { get; set; }
        public int? ThisMonthNotes { get; set; }
        public int? ThisWeekNotes { get; set; }
        public int? TodayNotes { get; set; }
        public int? TotalWords { get; set; }
        public string? LastUpdateTime { get; set; }
        public Dictionary<string, int>? FolderNoteCounts { get; set; }
        public Dictionary<string, int>? TagUsageCounts { get; set; }
    }
}
