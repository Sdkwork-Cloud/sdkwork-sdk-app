using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSpeakerGenerationVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? TaskId { get; set; }
        public string? SpeakerId { get; set; }
        public string? SpeakerName { get; set; }
        public string? Description { get; set; }
        public string? PreviewAudioUrl { get; set; }
        public string? Gender { get; set; }
        public string? AgeRange { get; set; }
        public string? Language { get; set; }
        public string? Style { get; set; }
        public string? Status { get; set; }
        public bool? Favorite { get; set; }
        public string? CompletedAt { get; set; }
    }
}
