using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSpeakerCreateForm
    {
        public string? Name { get; set; }
        public string? LocalName { get; set; }
        public string? Code { get; set; }
        public string? FaceImageUrl { get; set; }
        public string? Channel { get; set; }
        public string? Product { get; set; }
        public string? Gender { get; set; }
        public string? AgeType { get; set; }
        public string? Type { get; set; }
        public List<string>? Models { get; set; }
        public string? ChannelSpeakerId { get; set; }
        public string? Version { get; set; }
        public string? Description { get; set; }
        public List<string>? Tags { get; set; }
    }
}
