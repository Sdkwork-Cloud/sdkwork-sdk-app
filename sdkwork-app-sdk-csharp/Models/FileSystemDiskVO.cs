using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FileSystemDiskVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? DiskId { get; set; }
        public string? DiskUuid { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public string? Owner { get; set; }
        public string? OwnerId { get; set; }
        public int? TotalSize { get; set; }
        public int? UsedSize { get; set; }
        public int? RemainingSize { get; set; }
        public double? UsageRate { get; set; }
        public int? FileCount { get; set; }
        public string? Description { get; set; }
    }
}
