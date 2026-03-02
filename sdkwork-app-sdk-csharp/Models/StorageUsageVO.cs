using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class StorageUsageVO
    {
        public int? TotalSize { get; set; }
        public int? UsedSize { get; set; }
        public int? RemainingSize { get; set; }
        public int? FileCount { get; set; }
    }
}
