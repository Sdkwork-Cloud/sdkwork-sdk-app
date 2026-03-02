using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SoundEffectGenerationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? SoundEffectId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? AudioUrl { get; set; }
        public string? WaveformUrl { get; set; }
        public string? Category { get; set; }
        public int? Duration { get; set; }
        public string? Status { get; set; }
        public string? CompletedAt { get; set; }
    }
}
