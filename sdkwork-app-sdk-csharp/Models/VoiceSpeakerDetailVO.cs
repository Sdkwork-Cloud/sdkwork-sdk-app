using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSpeakerDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? LocalName { get; set; }
        public string? Code { get; set; }
        public string? FaceImageUrl { get; set; }
        public string? FaceVideoUrl { get; set; }
        public List<string>? ResourceUrls { get; set; }
        public string? Channel { get; set; }
        public string? ChannelName { get; set; }
        public string? Product { get; set; }
        public string? Gender { get; set; }
        public string? GenderName { get; set; }
        public string? AgeType { get; set; }
        public string? AgeTypeName { get; set; }
        public string? Type { get; set; }
        public string? TypeName { get; set; }
        public List<string>? Models { get; set; }
        public string? ChannelSpeakerId { get; set; }
        public string? Version { get; set; }
        public bool? IsDefault { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
        public List<VoiceSourceVO>? VoiceSources { get; set; }
        public List<string>? SampleAudios { get; set; }
        public Dictionary<string, object>? Attributes { get; set; }
    }
}
